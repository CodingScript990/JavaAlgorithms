package com.example.algorithmscodeup.programmersAlgorithms.day16;

import java.io.IOException;

// 문자열 겹쳐쓰기
public class Programmers181943 {
    public String solution(String my_string, String overwrite_string, int s) throws IOException {
        String answer = my_string.substring(0, s) + overwrite_string;

        if (my_string.length() > answer.length()) answer += my_string.substring(answer.length());

        return answer;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Programmers181943().solution("Program29b8UYP", "merS123", 7));
        //    my_string	   overwrite_string	   s	      result
        // "Program29b8UYP"	  "merS123"	       7	   "ProgrammerS123"
    }
}
