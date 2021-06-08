import org.junit.jupiter.api.*;

    public class RunnerJenkinsDemoTest {

        JenkinsDemo obj = new JenkinsDemo();

        @Test
        public void test1(){
            obj.test1();
            //System.out.println("Testing my first code");
        }

        @Test
        public void test2(){
            System.out.println("Testing my first code");
        }
        public void test3(){
            System.out.println("Testing Jenkins graph");
        }
    }


