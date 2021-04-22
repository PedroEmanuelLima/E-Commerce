package com.pedro.ecommerce.checkout.service;

import com.pedro.ecommerce.checkout.entity.CheckoutEntity;
import com.pedro.ecommerce.checkout.resource.checkout.CheckoutRequest;

import java.util.Optional;

public interface CheckoutService {

    Optional<CheckoutEntity> create(CheckoutRequest checkoutRequest);

    Optional<CheckoutEntity> updateStatus(String checkoutCode, CheckoutEntity.Status status);
}
