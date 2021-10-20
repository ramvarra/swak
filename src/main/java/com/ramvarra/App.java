package com.ramvarra;


public class App
{
    int add(int a, int b)
    {
        return a + b;
    }

    int mul(int a, int b)
    {
        return a * b;
    }

    public static void main(String[] args)
    {
        // System.out.printf("args.len: %d%n", args.length);
        // for (int i = 0; i < args.length; i++) {
        //     System.out.printf("args[%d] = '%s'%n", i, args[i]);
        // }
        if (args.length != 3) {
            System.err.println("Usage: App add|mul <n1> <n2>");
            return;
        }
        if (!(args[0].equals("add") || args[0].equals("mul"))) {
            System.err.printf("Error: invalid op %s%nUsage: App add|mul <n1> <n2>%n", args[0]);
            return;
        }
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int c = args[0].equals("add")? a  + b : a * b;
        System.out.printf("%d %s %d = %d%n", a, args[0], b, c);
    }
}
