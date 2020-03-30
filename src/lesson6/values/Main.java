package lesson6.values;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<AbstractParameter> parameterList = new ArrayList<>();

    public void addToParamList(AbstractParameter parameter) {
        parameterList.add(parameter);
    }

    public void setParamValue(AbstractParameter param, Object value) {
        parameterList.get(parameterList.indexOf(param)).setValue(value);
    }

    public void showAllParamValues() {
        for(AbstractParameter parameter : parameterList) {
            System.out.println(parameter.getValue());
        }
    }

    public static <T> T funcName(T param) {
        return param;
    }

    public static void main(String[] args) {
        funcName("new ArrayList<>()");
        List<String> list = new ArrayList<>();
        list.add("123"); list.add("124");
        AbstractParameter parameter = new MultipleTextParameter(list);
        System.out.println(parameter.getValue().getClass());
        parameter.setValue(list);
        System.out.println(parameter.getValue());
        parameter.setValue(1);
        AbstractParameter parameter1 = new SingleTextParameter("123");
        System.out.println(parameter1.getValue());
        Main main = new Main();
        main.addToParamList(parameter);
        main.addToParamList(parameter1);
        main.setParamValue(parameter1, "New String");
        main.showAllParamValues();
        //System.out.println();
    }
}
