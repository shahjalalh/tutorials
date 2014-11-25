<?php

namespace Custom\BookBundle\Controller;

use Symfony\Bundle\FrameworkBundle\Controller\Controller;

class DefaultController extends Controller
{
    public function indexAction()
    {
        return $this->render('CustomBookBundle:Default:index.html.twig');
    }
}
