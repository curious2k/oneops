/*
 * This file is generated by jOOQ.
*/
package com.oneops.crawler.jooq.cms.routines;


import com.oneops.crawler.jooq.cms.Kloopzcm;

import javax.annotation.Generated;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class MdUpdateClass2 extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 437871448;

    /**
     * The parameter <code>kloopzcm.md_update_class.p_class_id</code>.
     */
    public static final Parameter<Integer> P_CLASS_ID = createParameter("p_class_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_short_class_name</code>.
     */
    public static final Parameter<String> P_SHORT_CLASS_NAME = createParameter("p_short_class_name", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_super_class_id</code>.
     */
    public static final Parameter<Integer> P_SUPER_CLASS_ID = createParameter("p_super_class_id", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_impl</code>.
     */
    public static final Parameter<String> P_IMPL = createParameter("p_impl", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_is_namespace</code>.
     */
    public static final Parameter<Boolean> P_IS_NAMESPACE = createParameter("p_is_namespace", org.jooq.impl.SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_flags</code>.
     */
    public static final Parameter<Integer> P_FLAGS = createParameter("p_flags", org.jooq.impl.SQLDataType.INTEGER, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_access_level</code>.
     */
    public static final Parameter<String> P_ACCESS_LEVEL = createParameter("p_access_level", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_descr</code>.
     */
    public static final Parameter<String> P_DESCR = createParameter("p_descr", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * The parameter <code>kloopzcm.md_update_class.p_format</code>.
     */
    public static final Parameter<String> P_FORMAT = createParameter("p_format", org.jooq.impl.SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public MdUpdateClass2() {
        super("md_update_class", Kloopzcm.KLOOPZCM);

        addInParameter(P_CLASS_ID);
        addInParameter(P_SHORT_CLASS_NAME);
        addInParameter(P_SUPER_CLASS_ID);
        addInParameter(P_IMPL);
        addInParameter(P_IS_NAMESPACE);
        addInParameter(P_FLAGS);
        addInParameter(P_ACCESS_LEVEL);
        addInParameter(P_DESCR);
        addInParameter(P_FORMAT);
        setOverloaded(true);
    }

    /**
     * Set the <code>p_class_id</code> parameter IN value to the routine
     */
    public void setPClassId(Integer value) {
        setValue(P_CLASS_ID, value);
    }

    /**
     * Set the <code>p_short_class_name</code> parameter IN value to the routine
     */
    public void setPShortClassName(String value) {
        setValue(P_SHORT_CLASS_NAME, value);
    }

    /**
     * Set the <code>p_super_class_id</code> parameter IN value to the routine
     */
    public void setPSuperClassId(Integer value) {
        setValue(P_SUPER_CLASS_ID, value);
    }

    /**
     * Set the <code>p_impl</code> parameter IN value to the routine
     */
    public void setPImpl(String value) {
        setValue(P_IMPL, value);
    }

    /**
     * Set the <code>p_is_namespace</code> parameter IN value to the routine
     */
    public void setPIsNamespace(Boolean value) {
        setValue(P_IS_NAMESPACE, value);
    }

    /**
     * Set the <code>p_flags</code> parameter IN value to the routine
     */
    public void setPFlags(Integer value) {
        setValue(P_FLAGS, value);
    }

    /**
     * Set the <code>p_access_level</code> parameter IN value to the routine
     */
    public void setPAccessLevel(String value) {
        setValue(P_ACCESS_LEVEL, value);
    }

    /**
     * Set the <code>p_descr</code> parameter IN value to the routine
     */
    public void setPDescr(String value) {
        setValue(P_DESCR, value);
    }

    /**
     * Set the <code>p_format</code> parameter IN value to the routine
     */
    public void setPFormat(String value) {
        setValue(P_FORMAT, value);
    }
}
