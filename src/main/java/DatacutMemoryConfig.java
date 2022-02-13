import java.util.List;

public class DatacutMemoryConfig extends Reader{
    private List<HippoJob> jobs;
//    public DatacutMemoryConfig() {}


    public List<HippoJob> getJobs() {
        return jobs;
    }


    public void setJobs(List<HippoJob> jobs) {
        this.jobs = jobs;
    }



    @Override
    public String toString() {
        return "DatacutMemoryConfig{" +
                "jobs=" + jobs +
                '}';
    }


}

class HippoJob {
    private String job;
    private Datacut datacut;
//    public Job() {}
    public String getJob() {
        return job;
    }

    public Datacut getDatacut() {
        return datacut;
    }

    public void setDatacut(Datacut datacut) {
        this.datacut = datacut;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Job{" +
                "job='" + job + '\'' +
                ", datacut=" + datacut +
                '}';
    }


}

class Datacut {
    private MemoryArgs global;
    private MemoryArgs datacut1;

    public MemoryArgs getGlobal() {
        return global;
    }

    public void setGlobal(MemoryArgs global) {
        this.global = global;
    }

    public MemoryArgs getDatacut1() {
        return datacut1;
    }

    public void setDatacut1(MemoryArgs datacut1) {
        this.datacut1 = datacut1;
    }
//        public Datacut() {}
//        public String getGLOBAL() {
//            return global;
//        }
//
//        public String getGlobal() {
//            return global;
//        }
//
//        public void setGlobal(String global) {
//            this.global = global;
//        }
//
//        public String getDatacut1() {
//            return datacut1;
//        }
//
//        public void setDatacut1(String datacut1) {
//            this.datacut1 = datacut1;
//        }

    @Override
    public String toString() {
        return "Datacut{" +
                "global='" + global + '\'' +
                ", datacut1='" + datacut1 + '\'' +
                '}';
    }
    public class MemoryArgs {
        private String memoryArgs;

        public String getMemoryArgs() {
            return memoryArgs;
        }

        public void setMemoryArgs(String memoryArgs) {
            this.memoryArgs = memoryArgs;
        }

        @Override
        public String toString() {
            return "MemoryArgs{" +
                    "memoryArgs='" + memoryArgs + '\'' +
                    '}';
        }
    }
}