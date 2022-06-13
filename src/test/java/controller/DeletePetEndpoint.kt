package controller

import io.restassured.RestAssured
import io.restassured.RestAssured.given
import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.response.ValidatableResponse
import io.restassured.specification.RequestSpecification

private fun requestSpec(): RequestSpecification? {
    return RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setBasePath("/v2")
            .setContentType(ContentType.JSON)
            .build()
}

fun deletePetExecuteDeleteApiMethod(
        petId: Int,
):
        ValidatableResponse {
    return given(
                 requestSpec()).
            `when`().
                 delete("/pet/$petId").
             then()
}