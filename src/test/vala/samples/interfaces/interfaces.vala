interface DefaultInterface {
    const float CONSTANT = 31f;

    interface InternalInterface {
        const float INTERNAL_CONSTANT = 31f;
    }
}

abstract interface AbstractInterface {
    const float CONSTANT = 31f;
}

extern interface ExternInterface {
    const float CONSTANT = 31f;
}

sealed interface SealedInterface {
    const float CONSTANT = 31f;
}

