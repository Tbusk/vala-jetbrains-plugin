[Flags, CCode (cname = "int", cprefix = "SDL_INIT_", has_type_id = false)]
public enum InitFlags {
    AUDIO,
    VIDEO,
    JOYSTICK,
    HAPTIC,
    GAMEPAD,
    EVENTS,
    SENSOR,
    CAMERA
}

[Diagnostics, SimpleType, CCode (cname = "cname_property", has_type_id = false)]
public class BeforeNamespaceAttributeClass {

}

[CCode (cname = "cname_property", has_type_id = false), Diagnostics, SimpleType]
public struct PropertiesID : uint32 {}

[Diagnostics, CCode (cname = "cname_property", has_type_id = false), SimpleType]
public virtual delegate uint TestDelegate ();

[Diagnostics, PrintfFormat]
public errordomain decl {
    ERROR;
}

[Diagnostics, PrintfFormat]
const uint CONSTANT = 1;

[SimpleType, CCode (cname = "SDL_PropertiesID", has_type_id = false)]
public uint get_enums () {
    return 1u;
}

[SimpleType, CCode (cname = "SDL_PropertiesID", has_type_id = false)]
public interface TestInterface {

}