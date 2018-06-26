package com.colsmart.annotation;

import java.lang.annotation.*;

/**
 * 自定义注解指令单状态
 * Created by yinan.zhang on 2018/1/9.
 */
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.TYPE_PARAMETER, ElementType.FIELD, ElementType.LOCAL_VARIABLE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface FitsInstStatus {
    public enum InstStatus {
        NEW("新建", "1"),
        PENDING("待审批", "2"),
        APPROVALING("审批中", "3"),
        APPROVED("审批通过", "4"),
        APPROVALREFUSED("审批拒绝", "5"),
        NOAPPROVAL("无需审批", "6"),
        APPROVALROLLBACK("审批打回", "7"),
        EXECUTION("执行中", "8"),
        INVALID("已失效", "9");
        private String displayName;
        private String code;

        InstStatus(String name, String code) {
            this.displayName = name;
            this.code = code;
        }

        public String getDisplayName() {
            return displayName;
        }

        public String getCode() {
            return code;
        }
    }

    InstStatus orderStatus() default InstStatus.PENDING;
}
