using System;

public class AdapterClient
{
    public static void Adapter()
    {
        // Create electronic device
        MobilePhone device = new MobilePhone();

        // Create universal adapter
        UniversalAdapter adapter = new UniversalAdapter(device);

        // Connect device to electrical outlet and charge
        adapter.Request();
    }
}
