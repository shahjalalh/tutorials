<?php

namespace Custom\UserBundle;

use Symfony\Component\HttpKernel\Bundle\Bundle;

class CustomUserBundle extends Bundle
{
	public function getParent()
    {
        return 'FOSUserBundle';
    }
}
