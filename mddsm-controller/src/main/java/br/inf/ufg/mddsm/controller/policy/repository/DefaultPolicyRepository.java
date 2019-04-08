package br.inf.ufg.mddsm.controller.policy.repository;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DefaultPolicyRepository implements PolicyRepository {
    List<Policy> policies = new ArrayList<Policy>();

    public DefaultPolicyRepository(Collection<base.policy.Policy> definitions) {
        for (base.policy.Policy def : definitions) {
            Condition cond = new Condition(def.getFeature(), "request", "");
            Decision dec = new Decision(def.getDecision().getParameter(), def.getDecision().getOperation(), def.getDecision().getValue());
            BusinessValue bv = new BusinessValue("", "" + def.getBusinessValue());

            policies.add(new Policy(null, cond, bv, dec, null, def.getName()));
        }
    }


    public List<Policy> load(String feature, String oper) {
        List<Policy> arr = new ArrayList<Policy>();

        for (Policy policy : policies) {
            if (policy.getCondition().getFeature().equals(feature))
                arr.add(policy);
        }

        Collections.sort(arr);
        return arr;
    }

}
