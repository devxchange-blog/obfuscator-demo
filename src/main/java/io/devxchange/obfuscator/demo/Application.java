package io.devxchange.obfuscator.demo;
import io.devxchange.obfuscator.Obfuscator;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Application {

    public static void main (String args[]){

        testSimpleJson();
        testSimpleJson_md5();
        testSimpleJson_sha256();
        testSimpleJson_matchedMask();

        testJsonList();
        testJsonList_md5();
        testJsonList_sha256();
        testJsonList_matchedMask();

        testSimpleXML();
        testSimpleXML_md5();
        testSimpleXML_sha256();
        testSimpleXML_matchedMask();

        testComplexXML();
        testComplexXML_md5();
        testComplexXML_sha256();
        testComplexXML_matchedMask();
    }

    public static void testSimpleJson() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("obfuscate", items);
        String response = Obfuscator.obfuscateJsonString(simpleJson,obfuscatorMap);
        System.out.println(response);
    }
    public static void testSimpleJson_matchedMask() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("matchedMask", items);
        String response = Obfuscator.obfuscateJsonString(simpleJson,obfuscatorMap);
        System.out.println(response);
    }
    public static void testSimpleJson_md5() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("md5", items);
        String response = Obfuscator.obfuscateJsonString(simpleJson,obfuscatorMap);
        System.out.println(response);
    }
    public static void testSimpleJson_sha256() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("sha256", items);
        String response = Obfuscator.obfuscateJsonString(simpleJson,obfuscatorMap);
        System.out.println(response);
    }

    public static void testJsonList() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("obfuscate", items);
        String response = Obfuscator.obfuscateJsonString(jsonList,obfuscatorMap);
        System.out.println(response);
    }
    public static void testJsonList_matchedMask() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("matchedMask", items);
        String response = Obfuscator.obfuscateJsonString(jsonList,obfuscatorMap);
        System.out.println(response);
    }
    public static void testJsonList_md5() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("md5", items);
        String response = Obfuscator.obfuscateJsonString(jsonList,obfuscatorMap);
        System.out.println(response);
    }

    public static void testJsonList_sha256() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("sha256", items);
        String response = Obfuscator.obfuscateJsonString(jsonList,obfuscatorMap);
        System.out.println(response);
    }

    public static void testSimpleXML() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("obfuscate", items);
        String response = Obfuscator.obfuscateXmlString(simpleXML,obfuscatorMap);
        System.out.println(response);
    }

    public static void testSimpleXML_matchedMask() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("matchedMask", items);
        String response = Obfuscator.obfuscateXmlString(simpleXML,obfuscatorMap);
        System.out.println(response);
    }
    public static void testSimpleXML_md5() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("md5", items);
        String response = Obfuscator.obfuscateXmlString(simpleXML,obfuscatorMap);
        System.out.println(response);
    }
    public static void testSimpleXML_sha256() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("sha256", items);
        String response = Obfuscator.obfuscateXmlString(simpleXML,obfuscatorMap);
        System.out.println(response);
    }

    public static void testComplexXML() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("obfuscate", items);
        String response = Obfuscator.obfuscateXmlString(complexXML,obfuscatorMap);
        System.out.println(response);
    }

    public static void testComplexXML_matchedMask() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("matchedMask", items);
        String response = Obfuscator.obfuscateXmlString(complexXML,obfuscatorMap);
        System.out.println(response);
    }

    public static void testComplexXML_md5() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("md5", items);
        String response = Obfuscator.obfuscateXmlString(complexXML,obfuscatorMap);
        System.out.println(response);
    }
    public static void testComplexXML_sha256() {
        Map<String, Set<String>> obfuscatorMap= new HashMap<>();
        Set<String> items = new HashSet<>();
        items.add("name");
        items.add("salary");
        items.add("age");
        obfuscatorMap.put("sha256", items);
        String response = Obfuscator.obfuscateXmlString(complexXML,obfuscatorMap);
        System.out.println(response);
    }

    private static String simpleJson = "{\"id\":1,\"name\":\"karthik\",\"age\":29,\"salary\":115000}";
    private static String jsonList = "{\"user\":[{\"id\":1,\"name\":\"karthik\",\"age\":29,\"salary\":115000},{\"id\":2,\"name\":\"Karthikeyan Sadayamuthu\",\"age\":30,\"salary\":500000},{\"id\":3,\"name\":\"Sadayamuthu\",\"age\":30,\"salary\":500000},{\"id\":4,\"name\":\"Vinodh Kannan Sadayamuthu\",\"age\":30,\"salary\":500000}]}";
    private static String simpleXML = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
            "<root>\n" +
            "  <id>1</id>\n" +
            "  <name>karthik</name>\n" +
            "  <age>29</age>\n" +
            "  <salary>115000</salary>\n" +
            "</root>";
    private static String complexXML = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n" +
            "<root>\n" +
            "  <user>\n" +
            "    <id>1</id>\n" +
            "    <name>karthik</name>\n" +
            "    <age>29</age>\n" +
            "    <salary>115000</salary>\n" +
            "  </user>\n" +
            "  <user>\n" +
            "    <id>2</id>\n" +
            "    <name>Karthikeyan Sadayamuthu</name>\n" +
            "    <age>30</age>\n" +
            "    <salary>500000</salary>\n" +
            "  </user>\n" +
            "  <user>\n" +
            "    <id>3</id>\n" +
            "    <name>Sadayamuthu</name>\n" +
            "    <age>30</age>\n" +
            "    <salary>500000</salary>\n" +
            "  </user>\n" +
            "  <user>\n" +
            "    <id>4</id>\n" +
            "    <name>Vinodh Kannan Sadayamuthu</name>\n" +
            "    <age>30</age>\n" +
            "    <salary>500000</salary>\n" +
            "  </user>\n" +
            "</root>";

}
