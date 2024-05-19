import { Device } from './Device';
import { Television } from './Television';
import { RegularRemoteControl } from './RegularRemoteControl';
import { SoundSystem } from './SoundSystem';
import { AdvancedRemoteControl } from './AdvancedRemoteControl';

// Creating a television device
let tv: Device = new Television();

// Using a basic remote control for the television
let remoteControl: RegularRemoteControl = new RegularRemoteControl(tv);

// Powering on the TV and changing the channel
remoteControl.powerOn();
remoteControl.changeChannel(5);

// Creating a sound system device
let soundSystem: Device = new SoundSystem();

// Using an advanced remote control for the sound system
let advancedRemoteControl: AdvancedRemoteControl = new AdvancedRemoteControl(soundSystem);

// Powering on the sound system, adjusting volume, and muting
advancedRemoteControl.powerOn();
advancedRemoteControl.adjustVolume(20);
advancedRemoteControl.mute();
