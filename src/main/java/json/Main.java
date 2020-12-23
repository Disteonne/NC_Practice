package json;


import com.fasterxml.jackson.databind.ObjectMapper;
/*
*               JSON FORMATTER
*           https://jsonformatter.org/
 */
public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper=new ObjectMapper();

        SomeData someData=new SomeData();
        someData.setParam1(100);
        someData.setParam2("keksic");
        someData.setParam3(true);
        int[] a={1,2,3,4,5,6};
        someData.setArray(a);

        InnerClass innerClass=new InnerClass();
        innerClass.setPar1("param");
        innerClass.setPar2("parparpar");
        someData.setInnerClass(innerClass);

        try {

            String result = objectMapper.writeValueAsString(someData);
            System.out.println(result);


            //          ОБРАТНОЕ ПРЕОБРАЗОВАНИЕ
            SomeData newData = objectMapper.readValue(result,SomeData.class);
            System.out.println(newData.getParam1());
            System.out.println(newData.getInnerClass().getPar2());
        }catch (Exception ex){}

    }
}
