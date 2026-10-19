package abid.guided.guided3;

public class Komputer {
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;

    public Komputer(String merkCpu, int kecepatanCpu, String merkMonitor, String merkMouse, String typeMouse) {
        this.cpu = new CPU(merkCpu, kecepatanCpu);
        this.monitor = new Monitor(merkMonitor);
        this.mouse = new Mouse(merkMouse, typeMouse);
    }

    public void displaySpecKomputer() {
        System.out.println("=== Spesifikasi Komputer ===");
        System.out.print("CPU     : ");
        cpu.DisplaySpecCPU();

        System.out.print("Monitor : ");
        monitor.DisplaySpecMonitor();

        System.out.print("Mouse   : ");
        mouse.DisplaySpecMouse();
    }
}