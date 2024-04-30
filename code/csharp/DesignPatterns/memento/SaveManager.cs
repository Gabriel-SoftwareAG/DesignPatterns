namespace Memento;
using System.Collections.Generic;

class SaveManager
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
