
public class Devices {
    private Smartphone [] smartphone;
    private Laptop [] laptop;

    public Devices(Smartphone smartphone[], Laptop laptop[])
    {
        this.smartphone = smartphone;
        this.laptop = laptop;
    }
    public Devices()
    {
        for (int i = 0; i < 10; i++)
        {
            this.smartphone[i] = new Smartphone("Model", 0, 0);
        }
        for (int i = 0; i < 10; i++)
        {
            this.laptop[i] = new Laptop("Model", 0, 0);
        }
    }
    public void input_dev(int n_sp, int n_lt)
    {
        for (int i = 0; i < n_sp; i++)
        {
            this.smartphone[i].input_sp();
        }
        for (int i = 0; i < n_lt; i++)
        {
            this.laptop[i].input_lt();
        }
    }
    public void output_dev(int n_sp, int n_lt)
    {
        for (int i = 0; i < n_sp; i++)
        {
            this.smartphone[i].output_sp();
        }
        for (int i = 0; i < n_lt; i++)
        {
            this.laptop[i].output_lt();
        }
    }
    public int income_dev(int n_sp, int n_lt)
    {
        int income_sp = 0, income_lt = 0;
        for (int i = 0; i < n_sp; i++)
            income_sp += smartphone[i].income_sp();
        for (int i = 0; i < n_lt; i++)
            income_lt += laptop[i].income_lt();
        return income_sp + income_lt;
    }
}
