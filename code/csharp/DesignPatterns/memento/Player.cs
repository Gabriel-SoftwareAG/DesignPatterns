namespace Memento;

class Player
{
    private string _state;

    public string State
    {
        get => _state;
        set => _state = value;
    }

    public GameState SaveStateToMemento()
    {
        return new GameState(_state);
    }

    public void GetStateFromMemento(GameState gameState)
    {
        _state = gameState.State;
    }
}
