#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

public class HelloWorld {

    public static void main(String[] args) {
        var a=5;
        var b=6;
        System.out.printf("%d+%d=%d\n", a, b, a+b);
    }
}
