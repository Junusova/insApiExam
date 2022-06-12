package controller

import io.restassured.RestAssured.given
import io.restassured.builder.RequestSpecBuilder
import io.restassured.http.ContentType
import io.restassured.http.Header
import io.restassured.response.ValidatableResponse
import io.restassured.specification.RequestSpecification

private fun requestSpec(): RequestSpecification? {
    return RequestSpecBuilder()
            .setBaseUri(BASE_URL)
            .setBasePath("/v2")
            .setContentType(ContentType.JSON)
            .build()
}

fun createPetExecutePostApiMethod(
        requestPayload: String?,
):
        ValidatableResponse {
    return given(
            requestSpec())
                 .body(requestPayload).
            `when`().
                  post("/pet").
            then()
}