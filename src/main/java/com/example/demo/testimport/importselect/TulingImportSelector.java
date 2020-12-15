package com.example.demo.testimport.importselect;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * Created by YanceyYao on 2019/5/20.
 */
public class TulingImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.demo.testimport.compent.Dog"};
    }
}
