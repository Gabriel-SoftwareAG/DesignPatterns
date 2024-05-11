from Television import Television
from SoundSystem import SoundSystem
from RegularRemoteControl import RegularRemoteControl
from AdvancedRemoteControl import AdvancedRemoteControl

if __name__ == "__main__":
    tv = Television()
    remote_control = RegularRemoteControl(tv)
    remote_control.power_on()
    remote_control.change_channel(5)

    sound_system = SoundSystem()
    advanced_remote_control = AdvancedRemoteControl(sound_system)
    advanced_remote_control.power_on()
    advanced_remote_control.adjust_volume(20)
    advanced_remote_control.mute()
