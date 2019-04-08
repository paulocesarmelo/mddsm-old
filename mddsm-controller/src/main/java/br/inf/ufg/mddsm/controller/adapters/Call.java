package br.inf.ufg.mddsm.controller.adapters;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Call {
    String name();
    String[] parameters() default {};
}
