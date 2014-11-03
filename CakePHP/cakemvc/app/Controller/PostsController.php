<?php
App::uses('AppController', 'Controller');

/**
 * Posts Controller
 */
class PostsController extends AppController
{

    /**
     * Components
     */
    public $components = array('Paginator');

    /**
     * index method
    */
    public function index()
    {
        $this->Post->recursive = 0;
        $this->set('posts', $this->Paginator->paginate());
    }
}
