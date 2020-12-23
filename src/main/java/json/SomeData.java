package json;

public class SomeData {
    private int param1;
    private String param2;
    private boolean param3;
    private int[] array;
    private InnerClass innerClass;


    public InnerClass getInnerClass() {
        return innerClass;
    }

    public void setInnerClass(InnerClass innerClass) {
        this.innerClass = innerClass;
    }

    public int getParam1() {
        return param1;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int[] getArray() {
        return array;
    }

    public String getParam2() {
        return param2;
    }

    public boolean isParam3() {
        return param3;
    }

    public void setParam1(int param1) {
        this.param1 = param1;
    }

    public void setParam2(String param2) {
        this.param2 = param2;
    }

    public void setParam3(boolean param3) {
        this.param3 = param3;
    }
}
