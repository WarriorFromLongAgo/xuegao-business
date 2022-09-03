package com.xuegao;// package com.xuegao;
//
// import com.alibaba.fastjson2.JSON;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;
//
// public interface AbstractLogService {
//     public static final Logger log = LoggerFactory.getLogger(AbstractLogService.class);
//
//     default void logInfo(String argsName, Object... args) {
//         StackTraceElement[] stackTraceElementArr = new Exception().getStackTrace();
//         StackTraceElement stackTraceElement = stackTraceElementArr[1];
//         String className = stackTraceElement.getClassName();
//         String[] classNameArr = className.split("\\.");
//         log.info("[applicationName][" + classNameArr[classNameArr.length - 1] + "][" + stackTraceElement.getMethodName() + "][" + argsName + "=" + JSON.toJSONString(args) + "]");
//     }
//
// }
