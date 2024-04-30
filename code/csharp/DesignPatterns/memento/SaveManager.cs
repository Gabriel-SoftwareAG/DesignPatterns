using System.Collections.Generic;

namespace Memento
{
    public class SaveManager
    {
        private readonly List<GameState> _savedStates = new List<GameState>();

        public void Add(GameState gameState)
        {
            _savedStates.Add(gameState);
        }

        public GameState Get(int index)
        {
            return _savedStates[index];
        }
    }
}
