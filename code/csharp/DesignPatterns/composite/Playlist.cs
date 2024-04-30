namespace Composite;
using System.Collections.Generic;

class Playlist : IPlaylistComponent
{
    private List<IPlaylistComponent> _components = 
                                                new List<IPlaylistComponent>();

    public void AddComponent(IPlaylistComponent component)
    {
        _components.Add(component);
    }

    public void RemoveComponent(IPlaylistComponent component)
    {
        _components.Remove(component);
    }

    public void PlaySong()
    {
        System.Console.WriteLine("Playing playlist:");
        foreach (var component in _components)
        {
            component.PlaySong();
        }
    }
}
