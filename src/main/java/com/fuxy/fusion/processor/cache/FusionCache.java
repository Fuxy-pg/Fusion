package com.fuxy.fusion.processor.cache;

/**
 * 缓存管理类，用来缓存Fusion聚合过程中查询的结果，针对同一查询结果，在短时间内，
 * 两次请求的结果相同，且第二次的请求数据不会再去进行查询操作，而是直接使用第一次
 * 的查询结果。
 *
 * <p>目前的缓存设计是采用的内存+redis的二级缓存策略</p>
 *
 * {@link }
 *
 *
 * @author JasonFuxy
 */
public class FusionCache {




}
