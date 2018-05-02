
public class GreetingWithFxInterface {

	public static void main(String[] args) {
		Greeting greeter = () -> System.out.println("Greeting from functional interface");
		greeter.greet();
		
		String str = "Greeting from functional interface with parameter";		
		GreetingWithArg greetWithArg = s -> System.out.println(s);
		greetWithArg.greet(str);
		
		String str1 = "Greeting from functional interface with parameter";
		GreetingWithArgAndReturn gwar = s -> { 
			return s + " and returns";
		};		
		System.out.println(gwar.greet(str1));
		
		String str2 = "Greeting with ";
		String str3 = "two arguments";
		GreetingWithTwoArg gwta = (s1,s2) -> System.out.println(s1 + s2);
		gwta.greet(str2, str3);

	}

}

@FunctionalInterface
interface Greeting {
	public void greet();
}

@FunctionalInterface
interface GreetingWithArg {
	public void greet(String arg);
}

@FunctionalInterface
interface GreetingWithArgAndReturn {
	public String greet(String arg);
}


@FunctionalInterface
interface GreetingWithTwoArg {
	public void greet(String arg, String arg1);
}
