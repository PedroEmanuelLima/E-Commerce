package com.pedro.ecommerce.payment.service;

import com.pedro.ecommerce.checkout.event.CheckoutCreatedEvent;
import com.pedro.ecommerce.payment.entity.PaymentEntity;

import java.util.Optional;

public interface PaymentService {

    Optional<PaymentEntity> create(CheckoutCreatedEvent checkoutCreatedEvent);
}
