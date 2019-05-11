package stuctural.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Application {

    /*
     *      Proxy - Client code
     *
     *
     *      Replace real object by object with layer, which executing some logic before/after core object logic
     */
    public static void main(String[] args) {

        // arrange
        Core core = new CoreImpl();
        //      insert core into proxy
        Core proxyInstance = (Core) Proxy.newProxyInstance(
                Application.class.getClassLoader(),
                new Class[]{Core.class},
                (proxy, method, methodArgs) -> {
                    System.out.println("PROXY logic here!");
                    if (method.getName().equals("show")) {
                        System.out.println("SHOW() method called!");
                        core.show();
                    } else {
                        System.out.println("ANOTHER PROXY method called!");
                    }
                    return proxy;
                });


        // act
        // using of CORE interface on PROXY object
        proxyInstance.show();
    }

}
