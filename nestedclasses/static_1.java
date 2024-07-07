package nestedclasses;

public class static_1 {
    public static void main(String[] args) {
        PC.hdd usbx = new PC.hdd(12);
        PC mypc = new PC("INTEL", usbx, 32);
        System.out.println(mypc);
        System.out.println(usbx);
    }
    public static class PC {
        hdd hdd;
        int ram;
        String cpu;

        public PC(String cpu, hdd hdd, int ram) {
            this.cpu = cpu;
            this.hdd = hdd;
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
        
        public static class hdd {
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
