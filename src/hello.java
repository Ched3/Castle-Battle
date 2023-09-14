public class hello {
    public static String doSomething(String str)

    {

        if (str.length() < 1)

        {

            return "";

        }

        else

        {

            return str.substring(0, 1) + doSomething(str.substring(1));

        }

    }

    public static void main(String[] args) {
        System.out.println(doSomething("dapedo"));
    }
}
