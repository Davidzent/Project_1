/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package revature;

import java.sql.SQLException;
import java.util.Scanner;

import revature.Controller.Controller;

import static revature.util.ConnectionUtil.con;

public class App {

    static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Controller conect = new Controller();
    }
}
