namespace TestInterfaceNamespace {
    public interface PaymentMethod : GLib.Object {
        // field, method declarations, and properties
        public abstract void process_payment (double amount);
        public abstract string last_four { public get; protected set; }
        public abstract string card_type { get; construct set; default = "Unknown"; }
    }

    interface Role : GLib.Object {
        public abstract string name { get; default = "USER"; }

        // struct declaration
        public struct Permissions {
            public bool can_view_profile;
            public bool can_edit_profile;
        }
    }

    interface OperatingSystem : GLib.Object {

        // constant declaration
        public const string OBJECT_TYPE = "Operating_System";

        // enum declaration
        public enum Type {
            WINDOWS,
            MACOS,
            LINUX,
            ANDROID,
            IOS
        }

        public abstract Type* os_type { get; }

        // method declaration
        public string[] get_os_names () {
            return new string[] { "Windows", "macOS", "Linux", "Android", "iOS" };
        }

        // signal declaration
        public signal int os_updated (string version) {
            return 0;
        }
    }
}