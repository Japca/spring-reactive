import React, {Component} from 'react'
import CSSModules from 'react-css-modules'
import styles from './modal.css'
import ReactTimeout from 'react-timeout'
import Button from 'mdbreact'

let clear;

@ReactTimeout
@CSSModules(styles, {allowMultiple: true})
export default class Modal extends Component {

    constructor(props) {
        super();
        this.state = {
            show: false
        }
    }

    render() {
        console.info("Modal layout")
        return (
            <div styleName="modal-layout">
                <button onClick={() => this.setState({show: true})}>Open Modal</button>
                <div id="myModal" styleName={"modal".concat(this.handleModal(this.state.show))}>
                        Modal
                </div>
            </div>

        )
    }


    handleModal = (show) => {
        if(show) {
            clear = setTimeout(this.closeModal, 2000)
        }
        return show ? " show" : "";
    }

    closeModal = () => {
        this.setState({show: false})
        clearTimeout(clear);
    }

}




