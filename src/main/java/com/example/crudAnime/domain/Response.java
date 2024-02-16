package com.example.crudAnime.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Objects;
import java.util.Optional;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Response {

    private Boolean status;
    private String mensage;
    private Object data;

    public Response(String type){
        if (Objects.equals(type, "ERRO")){
            this.status = false;
            this.mensage = "ocorreu um erro";
            this.data = "";
        }
        if (Objects.equals(type, "OK")) {
            this.status = true;
            this.mensage = "Operacao realizada com sucesso";
            this.data = "";
        }
    }

}
