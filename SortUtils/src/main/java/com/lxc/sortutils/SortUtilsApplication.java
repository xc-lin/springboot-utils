package com.lxc.sortutils;

import com.lxc.sortutils.bean.AbstractBean;
import com.lxc.sortutils.bean.ImplOrdered.Bean1;
import com.lxc.sortutils.bean.ImplOrdered.Bean2;
import com.lxc.sortutils.bean.ImplOrdered.Bean3;
import com.lxc.sortutils.bean.annotationOrder.AnnotationBean1;
import com.lxc.sortutils.bean.annotationOrder.AnnotationBean2;
import com.lxc.sortutils.bean.annotationOrder.AnnotationBean3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.OrderComparator;
import org.springframework.core.annotation.AnnotationAwareOrderComparator;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class SortUtilsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SortUtilsApplication.class, args);
        sort1();
        System.out.println();
        sort2();
    }
    public static void sort1(){
        List<AbstractBean> beans = Arrays.asList(new Bean3(), new Bean2(), new Bean1());

        System.out.println("排序前:"+beans);
        beans.sort(new OrderComparator());
        System.out.println("排序后:"+beans);

    }

    public static void sort2(){
        List<AbstractBean> beans = Arrays.asList(new AnnotationBean3(), new AnnotationBean2(), new AnnotationBean1());
        System.out.println("排序前:"+beans);
        beans.sort(new AnnotationAwareOrderComparator());
        System.out.println("排序后:"+beans);

    }

}
