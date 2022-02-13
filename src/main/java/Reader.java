import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Reader {
    public static void main(String args[]) throws Exception {
        // Loading the YAML file from the /resources folder
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        File file = new File(classLoader.getResource("datacut-specific-config.yaml").getFile());

        // Instantiating a new ObjectMapper as a YAMLFactory
        ObjectMapper om = new ObjectMapper(new YAMLFactory());

        // Mapping the employee from the YAML file to the Employee class
//        Employee employee = om.readValue(file, Employee.class);
        DatacutMemoryConfig dm = om.readValue(file,DatacutMemoryConfig.class);
//        List<HippoJob> jobs = dm.getJobs();
//        System.out.println("jobs size"+jobs.size());
//        for(HippoJob job : jobs) {
//            HippoJob.Datacut datacut = job.getDatacut();
//            String global= datacut.getGlobal();
//            System.out.println(global);
//        }
        // Printing out the information
//        System.out.println("Employee info " + employee.toString());
        System.out.println("Employee info " + dm.toString());
    }
}
