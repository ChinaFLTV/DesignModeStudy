/**
 * @author LiGuanda
 * @date 2022/12/9 下午 7:06:54
 * @description no description right now...
 * @filename Singleton.java
 */


public class Singleton {


    public static void main(String[] args) {

        System.out.println(IU.getInstance() == IU.getInstance());

    }


}


class IU {


    private IU() {
    }


    public static IU getInstance() {

        return IUU.instance;

    }


    private static class IUU {

        private static final IU instance = new IU();

    }


}
