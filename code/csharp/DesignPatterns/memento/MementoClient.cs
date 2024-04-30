using System;

namespace Memento
{
    public class MementoClient
    {
        public static void Memento()
        {
            Player player = new Player();
            SaveManager saveManager = new SaveManager();

            player.State = "Level 1";
            saveManager.Add(player.SaveStateToMemento());
            Console.WriteLine($"Player saved state: {player.State}");

            player.State = "Level 2";
            saveManager.Add(player.SaveStateToMemento());
            Console.WriteLine($"Player saved state: {player.State}");

            player.GetStateFromMemento(saveManager.Get(0));
            Console.WriteLine($"Player reverted to state: {player.State}");
        }
    }
}
