package com.example.demo.test;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.util.internal.StringUtil;
import org.springframework.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {

    public static void main(String[] args) {

        List<KypCrmDTO> list = new ArrayList<KypCrmDTO>();
        KypCrmDTO kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1001");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("股票");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2001");
        //kypCrmDTO.setPriority(2.74344);
        kypCrmDTO.setLast(2.4453434);
        list.add(kypCrmDTO);

        kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1007");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("股票");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2007");
        kypCrmDTO.setPriority(-1.734343);
        kypCrmDTO.setLast(-1.2332323);
        list.add(kypCrmDTO);

        kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1002");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("基金");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2002");
        kypCrmDTO.setPriority(1.5542);
        list.add(kypCrmDTO);

        kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1003");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("现金1");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2003");
        kypCrmDTO.setPriority(-2.5342423);
        list.add(kypCrmDTO);

        kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1004");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("股票1");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2004");
        kypCrmDTO.setPriority(-1.4233454);
        list.add(kypCrmDTO);

        kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1005");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("股票");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2005");
        kypCrmDTO.setPriority(5.1293823343);
        list.add(kypCrmDTO);

        kypCrmDTO = new KypCrmDTO();
        kypCrmDTO.setProductId("1006");
        kypCrmDTO.setTagDesc("this is product");
        kypCrmDTO.setTagName("股票");
        kypCrmDTO.setExtraFields("保证让你赚翻");
        kypCrmDTO.setLabelId("2006");
        kypCrmDTO.setPriority(3.4542333);
        list.add(kypCrmDTO);

        // System.out.println(list);

//        List<String> data = list.stream().map(KypCrmDTO::getProductId).filter(p -> !StringUtils.isEmpty(p)).collect(Collectors.toList());
//        System.out.println(data);
//        data.forEach(System.out::println);
//

        Map<String, KypCrmDTO> poolInfoMap = list.stream().collect(Collectors.toMap(p -> p.getProductId(), p -> p, (key1, key2) -> key1));

        System.out.println(poolInfoMap);

        List<Map<String,Object>> list1 = new ArrayList<>();
        poolInfoMap.forEach((k, v) -> {
            System.out.println("key:value = " + k + ":" + v);
            Map<String,Object> map = new HashMap<>();
            map.put(k,v);
            list1.add(map);

        });
        System.out.println("获取到1001的值："+poolInfoMap.get("1001"));
        KypCrmDTO obj = poolInfoMap.get("1001");
        System.out.println("获取到值："+obj.getExtraFields());
        List<KypCrmDTO> kypCrmDTOS = new ArrayList<>();
        list1.stream().forEach(map -> map.forEach((k,v) -> kypCrmDTOS.add((KypCrmDTO) v)));
        // System.out.println("key: "+k+" "+"value:"+v)
        System.out.println("=========粗筛选的结果===========");
        kypCrmDTOS.stream().forEach(System.out :: println);
//        for (KypCrmDTO k : kypCrmDTOS){
//            System.out.println(k.getTagName());
//        }
        System.out.println("==============精筛选后的结果======");
        List<KypCrmDTO> kypCrmDTOS2 = new ArrayList<>();
        kypCrmDTOS.stream().filter(l -> (l.getPriority() != null && l.getPriority() >= 0) || (l.getPriority() == null && l.getLast() >= 0)).forEach(x -> kypCrmDTOS2.add(x));
        kypCrmDTOS2.stream().forEach(System.out::println);
        //KypCrmDTO v = (KypCrmDTO)v;


        String ste = "0.006029";
        Double ds = Double.parseDouble(ste);
        System.out.println(ds);

        List<KypCrmDTO> testList = new ArrayList<>();

        KypCrmDTO kypCrmDTO1 = new KypCrmDTO();
        kypCrmDTO1.setId(Long.parseLong("10001"));
        testList.add(kypCrmDTO1);

        KypCrmDTO kypCrmDTO2 = new KypCrmDTO();
        kypCrmDTO2.setId(Long.parseLong("10002"));
        testList.add(kypCrmDTO2);

        KypCrmDTO kypCrmDTO3 = new KypCrmDTO();
        kypCrmDTO3.setId(Long.parseLong("10003"));
        testList.add(kypCrmDTO3);

        KypCrmDTO kypCrmDTO4 = new KypCrmDTO();
        kypCrmDTO4.setId(Long.parseLong("10004"));
        testList.add(kypCrmDTO4);

        KypCrmDTO kypCrmDTO5 = new KypCrmDTO();
        kypCrmDTO5.setId(Long.parseLong("10005"));
        testList.add(kypCrmDTO5);

        KypCrmDTO kypCrmDTO6 = new KypCrmDTO();
        kypCrmDTO6.setId(Long.parseLong("10006"));
        testList.add(kypCrmDTO6);
        System.out.println("移除前====");
        for (KypCrmDTO l : testList){
            System.out.println(l.getId());
        }

        long a = 10002;
        Set<String> strList = new HashSet<>();//模拟从服务器中获取
        strList.add("10001");
        strList.add("10002");
//        if (strList.contains(a)){
//            System.out.println("包含");
//        }else {
//            System.out.println("不包含");
//        }
        System.out.println("移除后======");
        testList.removeIf(p -> strList.contains(String.valueOf(p.getId())));

        for (KypCrmDTO l : testList){
            System.out.println(l.getId());
        }


    }
}
