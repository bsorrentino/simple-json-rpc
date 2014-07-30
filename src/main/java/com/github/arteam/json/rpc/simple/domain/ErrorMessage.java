package com.github.arteam.json.rpc.simple.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

/**
 * Date: 07.06.14
 * Time: 15:16
 * <p/>
 * Representation of a JSON-RPC error message
 *
 * @author Artem Prigoda
 */
public class ErrorMessage {

    @JsonProperty("code")
    private final int code;

    @NotNull
    @JsonProperty("message")
    private final String message;

    public ErrorMessage(int code, @NotNull String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    @NotNull
    public String getMessage() {
        return message;
    }
}