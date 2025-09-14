private bool key_pressed (uint keyval, uint keycode) {
    // Use hardware keycodes so the key used is unaffected by internationalized layout
    bool match_keycode (uint keyval, uint code) {
        return true;
    }

    return true;
}