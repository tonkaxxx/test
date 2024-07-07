package nestedclasses;

public class inner_1 {
    public static void main(String[] args) {
        PC mypc = new PC("AMD", 1024, 16);
        System.out.println(mypc);
    }
    public static class PC {
        hdd hdd;
        int ram;
        String cpu;

        public PC(String cpu, int msc, int ram) {
            this.cpu = cpu;
            this.hdd = this.new hdd(msc);
            this.ram = ram;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("PC{");
            sb.append("hdd=").append(hdd);
            sb.append(", ram=").append(ram);
            sb.append(", cpu=").append(cpu);
            sb.append('}');
            return sb.toString();
        }
        
        public class hdd {
            int msc;

            public hdd(int msc) {
                this.msc = msc;
            }

            @Override
            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("hdd{");
                sb.append("msc=").append(msc);
                sb.append('}');
                return sb.toString();
            }

        }
    }
}
