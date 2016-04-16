package testParsingTokenizingFormatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.*;

class Regex {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter Pattern");
		Pattern p = Pattern.compile(new BufferedReader(new InputStreamReader(System.in)).readLine());
		System.out.println("Enter Matcher");
		Matcher m = p.matcher(new BufferedReader(new InputStreamReader(System.in)).readLine());
		System.out.println("Pattern is " + m.pattern());
		while (m.find()) {
			System.out.println(m.start() + " " + m.group());
		}
	}
}
