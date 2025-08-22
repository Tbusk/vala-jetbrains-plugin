private delegate int PrivateDelegate (string a, string b);
protected delegate int ProtectedDelegate (string a, string b);
internal delegate int InternalDelegate (string a, string b);
public delegate int PublicDelegate (string a, string b);

delegate int DefaultDelegate (string a, string b);

abstract delegate int AbstractDelegate (string a, string b);
async delegate int AsyncDelegate (string a, string b);
class delegate int ClassDelegate (string a, string b);
extern delegate int ExternDelegate (string a, string b);
inline delegate int InlineDelegate (string a, string b);
override delegate int OverrideDelegate (string a, string b);
static delegate int StaticDelegate (string a, string b);
sealed delegate int SealedDelegate (string a, string b);
virtual delegate int VirtualDelegate (string a, string b);
