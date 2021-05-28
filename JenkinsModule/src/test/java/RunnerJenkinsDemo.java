import org.junit.jupiter.api.*;

    public class RunnerJenkinsDemo {

        JenkinsDemo obj = new JenkinsDemo();

        @Test
        public void runTest(){
            obj.test1();
            //System.out.println("Testing my first code");
        }

        @Test
        public void runTest2(){
            System.out.println("Testing my first code");
        }
    }


