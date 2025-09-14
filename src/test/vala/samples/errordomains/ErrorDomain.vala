private errordomain TestPrivateErrordomain {
    EXAMPLE_CODE,
}

public errordomain TestPublicErrordomain {
    EXAMPLE_CODE,
}

protected errordomain TestProtectedErrordomain {
    EXAMPLE_CODE,
}

internal errordomain TestInternalErrordomain {
    EXAMPLE_CODE,
}

errordomain TestDefaultAccessErrordomain {
    EXAMPLE_CODE,
}

extern errordomain TestExternErrordomain {
    EXAMPLE_CODE,
}

abstract errordomain TestAsyncErrordomain {
    EXAMPLE_CODE,
}

partial errordomain TestPartialErrordomain {
    EXAMPLE_CODE,
}

sealed errordomain TestSealedErrordomain {
    EXAMPLE_CODE,
}

errordomain TestMultipleErrorCodesErrordomain {
    EXAMPLE_CODE_1,
    EXAMPLE_CODE_2,
    EXAMPLE_CODE_3,
    EXAMPLE_CODE_4
}

errordomain TestCommentInsideErrordomain {
//TEST
    EXAMPLE_CODE_1,
    //TEST
    EXAMPLE_CODE_2
/* TEST
*/
}

errordomain TestAssignmentInsideErrordomain {
    EXAMPLE_CODE = 3,
    EXAMPLE_CODE_2 = true,
    EXAMPLE_CODE_3 = "STRING",
    EXAMPLE_CODE_4 = "STRING" == "string";
}

errordomain TestStaticMethodInsideErrordomain {
    EXAMPLE_CODE;

    public static int test () {
        return 1;
    }
}



