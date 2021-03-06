package br.inf.ufg.mddsm.broker.manager.actions;

import java.util.Map;

import br.inf.ufg.mddsm.broker.manager.ManagerContext;

public interface MacroActionInstance extends ActionInstance {
    Object execute(ManagerContext ctx, Map<String, Object> params);
}
