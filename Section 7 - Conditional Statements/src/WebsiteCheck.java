public class WebsiteCheck {
    public static void main(String[] args)
    {
        String url="https://www.google.com";
        int i=url.indexOf(":");
        int j=url.lastIndexOf(".");

        String protocol=url.substring(0,i);
        String domain=url.substring(j+1);

        System.out.println(protocol + " " + domain);

        System.out.println("Protocol used is:-");
       /* if(protocol.equals("https") || protocol.equals("http"))
        {
            System.out.println("It is Hyper text Transfer Protocol");
        }
        else if(protocol.equals("ftp"))
        {
            System.out.println("It is File Transfer Protocol");
        }

        System.out.println("Domain type is :-");
        if(domain.equals("com"))
        {
            System.out.println("This is com : Commercial domain");
        }
        else if(domain.equals("org"))
        {
            System.out.println("This is org : Organization domain");
        }
        else if(domain.equals("net"))
        {
            System.out.println("This is net : Network domain");
        } */

        //=============Using Switch Cases======================

        switch(protocol)
        {
            case "https" :
                System.out.println("its HyperText Transfer Protocol ");
                break;

            case "ftp" :
                System.out.println("its File transfer protocol");
                break;

            default :
                System.out.println("Invalid");
                break;
        }

        switch(domain)
        {
            case "com":
                System.out.println("its Commercial");
                break;

            case "org":
                System.out.println("its Organisation");
                break;

            case "net":
                System.out.println("its Network");
                break;

            default :
                System.out.println("Invalid");
                break;
        }
    }
}
